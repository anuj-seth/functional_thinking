(ns functional-thinking.divisible-n-test
  (:require [clojure.test :refer :all]))

; write a function called divisible that takes a number n
; and returns a function that takes one input argument
; and returns true if the input is divisible by n,
; false otherwise

(defn divisible-by-n 
  [n]
  (fn [num] (= 0 (mod num n))))

(deftest divisible-n-test
  ; make the below test cases pass
  (is (= true ((divisible-by-n 2) 4)))
  (is (= false ((divisible-by-n 3) 4))))



