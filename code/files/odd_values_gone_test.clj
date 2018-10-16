(ns functional-thinking.odd-values-gone-test
  (:require [clojure.test :refer :all]))

; write a function to remove key/value pairs from a map
; which have odd values.
; return value should be a map

(deftest odd-values-gone-test
  ; make the below test cases pass
  (let [keep-even-values __]
    (is (= {:b 2, :d 4}
           (keep-even-values {:a 1 :b 2 :c 3 :d 4})))
    (is (= {}
           (keep-even-values {})))
    (is (= {:a 2 :b 4 :c 6}
           (keep-even-values {:a 2 :b 4 :c 6})))))

