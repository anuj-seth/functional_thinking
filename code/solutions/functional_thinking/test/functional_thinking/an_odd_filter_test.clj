(ns functional-thinking.an-odd-filter-test
  (:require [clojure.test :refer :all]))

; write a function or one liner that returns only
; the odd values from a collection

(deftest an-odd-filter-test
  ; make the below test cases pass
  (is (= (filter odd? #{1 2 3 4 5}) '(1 3 5)))
  (is (= (filter odd? [4 2 1 6]) '(1)))
  (is (= (filter odd? [2 2 4 6]) '()))
  (is (= (filter odd? [1 1 1 3]) '(1 1 1 3))))

