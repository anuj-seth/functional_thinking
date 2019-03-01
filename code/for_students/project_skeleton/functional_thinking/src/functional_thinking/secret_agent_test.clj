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
  

(defn decode-directions
  [in-directions]
  __)

(is (= 5 (decode-directions (string-to-list "R2, L3"))))
(is (= 2 (decode-directions (string-to-list "R2, R2, R2"))))
(is (= 12 (decode-directions (string-to-list "R5, L5, R5, R3"))))
(is (= 231 (decode-directions 
             (string-to-list 
               (read-directions-from-file
                 "/home/anuj/course_files/for_students/project_skeleton/functional_thinking/src/functional_thinking/secret_agent_directions.txt")))))






