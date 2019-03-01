(ns functional-thinking.iterate-hanoi-test
  (:require [clojure.test :refer :all]))

(defn iterate-hanoi
  [n]
  __)

(defn hanoi-acc
  [acc n]
  (if (= n 0)
    acc
    (recur (inc (*' 2 acc)) (dec n))))

(defn hanoi
  [n]
  (if (zero? n)
    0
    (inc (*' 2 (hanoi (dec n))))))

(is (= 0
       (hanoi 0)
       (hanoi-acc 0 0)
       (iterate-hanoi 0)))

(is (= 1
       (hanoi 1)
       (hanoi-acc 0 1)
       (iterate-hanoi 1)))

(is (= 7
       (hanoi 3)
       (hanoi-acc 0 3)
       (iterate-hanoi 3)))

(is (= 255
       (hanoi 8)
       (hanoi-acc 0 8)
       (iterate-hanoi 8)))

