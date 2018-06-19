(ns ns-playground.core
  (:gen-class))

;; *******************************************************************
;; Remember that all functions have to be defined before they are used,
;; hence development in Clojure goes from top to bottom
;; *******************************************************************

(defn add-prime-numbers
  "This function takes a list of numbers and adds the prime numbers in it"
  [number-list]
  (reduce + (filter odd? number-list)))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println "Hello, World!")
  (println (add-prime-numbers (range 10))))
