(ns functional-thinking.lists-test
  (:require [clojure.test :refer :all]))


(is (= (list __)
       '(:a :b :c)))

(is (= __ (conj '(2 3 4)
                1)))

(is (= __ (conj '(3 4)
                2
                1)))
