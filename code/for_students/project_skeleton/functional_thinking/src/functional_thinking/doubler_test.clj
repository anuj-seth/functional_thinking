(ns functional-thinking.doubler-test
  (:require [clojure.test :refer :all]))

(defn doubler
  []
  __)

(is (= (doubler 2)
       4))

(is (= (doubler 3)
       6))

(is (= (doubler 11)
       22))

(is (= (doubler 7)
       14))
