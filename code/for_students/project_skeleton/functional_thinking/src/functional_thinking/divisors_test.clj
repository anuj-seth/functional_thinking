(ns functional-thinking.divisors-test
  (:require [clojure.test :refer :all]))

; write a function that returns the divisors
; of a given number

(is (= (__ 6)
       '(1 2 3)))

(is (= (__ 7)
       '(1)))

(is (= (__ 496)
       '(1 2 4 8 16 31 62 124 248)))

(is (= (__ 500)
       '(1 2 4 5 10 20 25 50 100 125 250)))

