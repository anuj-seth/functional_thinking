(ns functional-thinking.my-indexed-test
  (:require [clojure.test :refer :all]))

; write a function called my-indexed that tags each element
; of a collection with it's index
; restriction: map-indexed not allowed

(let [my-indexed __]
  (and
   (is (= '([0 1] [1 2] [2 3])
          (my-indexed [1 2 3])))

   (is (=  '([0 [:a 1]] [1 [:b 2]])
           (my-indexed {:a 1 :b 2})))

   (is (= ()
          (my-indexed [])))
   
   (is (= '([0 0] [1 1])
          (take 2 (my-indexed (range)))))))
