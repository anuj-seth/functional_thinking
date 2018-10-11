(ns functional-thinking.destructuring-test
  (:require [clojure.test :refer :all]))

(deftest destructuring-test
  ; make the below tests pass
  (is (= [2 4] (let [[a b c d e] [0 1 2 3 4]]
                 __)))
  (is (= __ (let [[a b c] [0 1]]
              c)))
  (is (= [1 2 [3 4 5] [1 2 3 4 5]] 
         (let [[a b & c :as d] __]
           [a b c d]))))
