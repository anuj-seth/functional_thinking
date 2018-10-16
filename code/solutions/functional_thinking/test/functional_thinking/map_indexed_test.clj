(ns functional-thinking.map-indexed-test
  (:require [clojure.test :refer :all]))

; transform a sequence into a sequence of pairs
; containing original element and index

(deftest map-indexed-test
  ; make the below test cases pass
  (let [my-fn (fn [s] (map-indexed (fn [idx elt]
                                     [elt idx])
                        s))]
    (is (= (my-fn [:a :b :c]) [[:a 0] [:b 1] [:c 2]]))
    (is (= (my-fn [0 1 3]) '((0 0) (1 1) (3 2))))
    (is (= (my-fn [[:foo] {:bar :baz}])
           [[[:foo] 0] [{:bar :baz} 1]]))))


