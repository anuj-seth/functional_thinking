(ns functional-thinking.clean-names-test
  (:require [clojure.test :refer :all]))


(defn clean-names
  [l]
  (clojure.string/join ","
                       (map clojure.string/capitalize
                            (filter #(> (count %) 1 )
                                    l))))
(defn clean-names->>
  [l]
  (->> l
       (filter #(> (count %) 1))
       (map clojure.string/capitalize)
       (clojure.string/join ",")))

(is (= (clean-names ["neel" "s" "nitin"
                     "j" "mukesh" "vijay"
                     "dinanath" "j" "chauhan"
                     "amar" "akbar" "anthony"])
       (clean-names->> ["neel" "s" "nitin"
                        "j" "mukesh" "vijay"
                        "dinanath" "j" "chauhan"
                        "amar" "akbar" "anthony"])))
