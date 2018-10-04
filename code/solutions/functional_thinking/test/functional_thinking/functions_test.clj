(ns functional-thinking.functions-test
  (:require [clojure.test :refer :all]))

(deftest functions-test
  ; make the below tests pass
  (is (= 8 ((fn add-five [x] (+ x 5)) 3)))
  (is (= 8 ((fn [x] (+ x 5)) 3)))
  (is (= 8 (#(+ % 5) 3)))
  (is (= ((fn [a b] (+ a b)) 1 1)
         (#(+ %1 %2) 1 1))))

