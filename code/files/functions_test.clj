(ns functional-thinking.functions-test
  (:require [clojure.test :refer :all]))

(deftest functions-test
  ; make the below tests pass
  (is (= __ ((fn add-five [x] (+ x 5)) 3)))
  (is (= __ ((fn [x] (+ x 5)) 3)))
  (is (= __ (#(+ % 5) 3)))
  (is (= ((fn [a b] (+ a b)) 1 __)
         (#(+ %1 %2) 1 __))))
