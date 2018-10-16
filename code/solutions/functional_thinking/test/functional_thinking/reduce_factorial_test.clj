(ns functional-thinking.reduce-factorial-test
  (:require [clojure.test :refer :all]))

; write a function that uses reduce to calculate factorials
; and make the below test cases pass

(deftest reduce-factorial-test
  ; make the below test cases pass
  (let [factorial (fn [n] 
                    (reduce * (range 1 (inc n))))]
    (is (= (factorial 1) 1))
    (is (= (factorial 3) 6))
    (is (= (factorial 5) 120))
    (is (= (factorial 8) 40320))))

