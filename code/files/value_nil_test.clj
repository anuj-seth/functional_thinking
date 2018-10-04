(ns functional-thinking.value-nil-test
  (:require [clojure.test :refer :all]))

(defn value-nil?
  [])

(deftest value-nil-test
  ; make the below tests pass by writing a function 
  ; which given a key and a map returns true iff 
  ; the map contains an entry with that key and it's 
  ; value is nil
  (is (true?  (value-nil? :a {:a nil :b 2})))
  (is (false? (value-nil? :b {:a nil :b 2})))
  (is (false? (value-nil? :c {:a nil :b 2}))))
