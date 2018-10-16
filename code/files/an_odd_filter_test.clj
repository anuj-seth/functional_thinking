(ns functional-thinking.an-odd-filter-test
  (:require [clojure.test :refer :all]))

; write a function or one liner that returns only
; the odd values from a collection

(deftest an-odd-filter-test
  ; make the below test cases pass
  (is (= (__ #{1 2 3 4 5}) '(1 3 5)))
  (is (= (__ [4 2 1 6]) '(1)))
  (is (= (__ [2 2 4 6]) '()))
  (is (= (__ [1 1 1 3]) '(1 1 1 3))))

