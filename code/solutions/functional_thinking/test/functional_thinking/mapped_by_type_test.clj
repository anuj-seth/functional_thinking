(ns functional-thinking.mapped-by-type-test
  (:require [clojure.test :refer :all]))

; convert the input vectors into maps keyed 
; by the type of the vector items

; hint: (doc group-by)
; hint hint: (doc type)
(deftest mapped-by-type-test
  ; make the below test cases pass
  (let [by-type (fn [v] 
                  (group-by type v))]
    (is (= (by-type [1 :a 2 :b 3 :c])
           {java.lang.Long [1 2 3],
            clojure.lang.Keyword [:a :b :c]}))
    (is (= (by-type [:a "foo"  "bar" :b])
           {clojure.lang.Keyword [:a :b],
            java.lang.String ["foo" "bar"]}))))

