(ns functional-thinking.recursive-hanoi-test
  (:require [clojure.test :refer :all]))

(defn hanoi-acc
  [acc n])

(defn hanoi
  [n])

(is (= 0
       (hanoi 0)
       (hanoi-acc 0 0)))

(is (= 1
       (hanoi 1)
       (hanoi-acc 0 1)))

(is (= 7
       (hanoi 3)
       (hanoi-acc 0 3)))

(is (= 255
       (hanoi 8)
       (hanoi-acc 0 8)))

