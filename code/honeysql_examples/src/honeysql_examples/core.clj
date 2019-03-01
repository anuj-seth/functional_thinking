(ns honeysql-examples.core)

(require '[honeysql.core :as sql]
         '[honeysql.helpers :refer :all :as helpers])


(sql/format {:select [:a :b :c]
             :from [:foo]
             :where [:= :a "baz"]})

(sql/format {:union [{:select [:*]
                      :from [:foo]}
                     {:select [:*]
                      :from [:bar]}]})

(def a {:select [:f.* :b.baz :c.quux [:b.bla "bla-bla"]
                 (sql/call :now) (sql/raw "@x := 10")]
        :modifiers [:distinct]
        :from [[:foo :f] [:baz :b]]
        :join [:draq [:= :f.b :draq.x]]
        :left-join [[:clod :c] [:= :f.a :c.d]]
        :right-join [:bock [:= :bock.z :c.e]]
        :where [:or
                [:and [:= :f.a "bort"] [:not= :b.baz (sql/param :param1)]]
                [:< 1 2 3]
                [:in :f.e [1 (sql/param :param2) 3]]
                [:between :f.e 10 20]]
        :group-by [:f.a]
        :having [:< 0 :f.e]
        :order-by [[:b.baz :desc] :c.quux [:f.a :nulls-first]]
        :limit 50
        :offset 10})

(defn great-infy-data-pipeline
  [result-gatherer map-fn filter-fn data-generator]
  (result-gatherer
   (map map-fn
        (filter filter-fn (data-generator)))))

(great-infy-data-pipeline identity
                          (fn [{:keys [emp-id] :as m}]
                            (assoc m :emp-id (inc emp-id)))
                          
                          #(= :female (:gender %))

                          #(vector 
                            {:emp-id 1234, :gender :male}
                            {:emp-id 1456 :gender :female}
                            {:emp-id 45636 :gender :female}))


(great-infy-data-pipeline #(take 10 %)

                          #(+ 10 %)
                          
                          identity
                          
                          range)
