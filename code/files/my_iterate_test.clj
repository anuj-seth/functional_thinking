(ns functional-thinking.my-iterate-test
  (:require [clojure.test :refer :all])
  (:refer-clojure :exclude [iterate]))

; given a side-effect free function f and an initial value x
; write a function which returns an infinite lazy sequence
; of x, (f x), (f (f x)), (f (f (f x))), etc.

(defn my-iterate
  [f x]
  __)

(deftest my-iterate-test
  ; make the tests pass
  (is (= (take 5 (my-iterate #(* 2 %) 1))
         [1 2 4 8 16]))
  (is (= (take 100 (my-iterate inc 0))
         (take 100 (range))))
  (is (= (take 9 (my-iterate #(inc (mod % 3)) 1))
         (take 9 (cycle [1 2 3])))))

