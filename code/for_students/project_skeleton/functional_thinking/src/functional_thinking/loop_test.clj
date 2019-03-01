(ns functional-thinking.loop-test
  (:require [clojure.test :refer :all]))

(is (= __
       (loop [x 5
              result []]
         (if (> x 0)
           (recur (dec x)
                  (conj result
                        (+ 2 x)))
           result))))

