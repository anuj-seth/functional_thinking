(ns functional-thinking.apply-factorial-test
  (:require [clojure.test :refer :all]))

; write a function that uses apply to calculate factorials
; and make the below test cases pass

(let [factorial __]
  (and 
   (is (= (factorial 1)
          1))

   (is (= (factorial 3)
          6))

   (is (= (factorial 5)
          120))

   (is (= (factorial 8)
          40320))))
