(ns functional-thinking.recursion-test
  (:require [clojure.test :refer :all]))

(deftest recursion-test
  ; make this test pass
  (is (= __ ((fn foo [x] 
               (when (> x 0) 
                 (conj (foo (dec x))
                       x)))
             5))))
; hint: (conj nil 1) returns (1)
; hint hint: when returns nil if the condition is not true


