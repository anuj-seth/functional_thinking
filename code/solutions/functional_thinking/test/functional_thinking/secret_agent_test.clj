(ns functional-thinking.secret-agent-test
  (:require [clojure.test :refer :all]))

; You are air-dropped in an unknown city with a set of instructions on how to
; find the location of the enemy ammunition depot that you need to destroy.
; You should start at the co-ordinates you are dropped at and face north, and
; then either turn left (L) or right (R) ninety degrees and then move the given
; number of blocks in that direction.
; How far is the shortest path to the destination,
; given that you can only walk on the street grid ?


(defn string-to-list
  [s]
  (clojure.string/split s #", "))

(defn read-directions-from-file
  [filename]
  (slurp filename))

(defn convert-directions
  [in-directions]
  (map (fn [turn-move]
         (let [[turn move] (clojure.string/split turn-move #" ")]
           [(keyword turn) (read-string move)]))
       in-directions))

(defn new-direction
  [current-direction turn-to]
  (let [new-headings-map {[:N :R] [:E [1 0]]
                          [:N :L] [:W [-1 0]]
                          [:W :R] [:N [0 1]]
                          [:W :L] [:S [0 -1]]
                          [:S :R] [:W [-1 0]]
                          [:S :L] [:E [1 0]]
                          [:E :R] [:S [0 -1]]
                          [:E :L] [:N [0 1]]}]
    (new-headings-map [current-direction turn-to])))

(defn new-direction-and-co-ordinates
  [[direction [curr-x curr-y]] [turn move-by]]
  (let [[new-direction [x-delta y-delta]] (new-direction direction turn)
        new-co-ordinates [(+ curr-x (* x-delta move-by))
                          (+ curr-y (* y-delta move-by))]]
    [new-direction new-co-ordinates]))

(defn decode-directions
  [in-directions]
  (let [directions (convert-directions in-directions)
        start-co-ordinates [0 0]
        start-direction :N]
    (apply + (map #(Math/abs %) 
               (second
                 (reduce new-direction-and-co-ordinates
                   [start-direction start-co-ordinates]
                   directions))))))

(deftest secret-agent-test
  (is (= 5 (decode-directions (string-to-list "R2, L3"))))
  (is (= 2 (decode-directions (string-to-list "R2, R2, R2"))))
  (is (= 12 (decode-directions (string-to-list "R5, L5, R5, R3"))))
  (is (= 231 (decode-directions (string-to-list 
                                 (read-directions-from-file
                                  "test/functional_thinking/secret_agent_directions.txt"))))))






