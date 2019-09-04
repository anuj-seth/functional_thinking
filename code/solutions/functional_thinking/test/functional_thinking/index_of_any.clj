(ns functional-thinking.index-of-any
  (:require [clojure.test :refer :all]))

(defn index-of-all
  [s l]
  (let [filter-fn (fn [[idx c]]
                    ((set l) c))]
    (filter filter-fn
            (map-indexed #(vector %1 %2)
                         s))))

(defn index-of-any
  [s l]
  (first (index-of-all s
                       l)))

(index-of-any "zzabyycdxx"
              [\z \a])

(is (= [0 \z]
       (index-of-any "zzabyycdxx"
                     [\z \a])))

(is (= [3 \b]
       (index-of-any "zzabyycdxx"
                     [\b \y])))

(is (= nil
       (index-of-any "aba"
                     [\z])))
