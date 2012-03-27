; Fizz Buzz in Clojure

(defn divisible [x n]
  (if (= 0 (mod x n))
    :true))

(defn fb [n]
  (if (= 0 n)
    ()
    (do
      (fb  (- n 1))
      (cond 
        (divisible n 15) (println "FizzBuzz")
        (divisible n 3 ) (println "Fizz")
        (divisible n 5 ) (println "Buzz")
        true (println n)
        )
      )
  ))

(fb 100)
(println "")

