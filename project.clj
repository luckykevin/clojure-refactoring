(defproject clojure-refactoring "0.3.1-SNAPSHOT"
  :description "Clojure side of a refactoring tool"
  :dependencies [[org.clojure/clojure "1.2.0-RC3"]
                 [org.clojure/clojure-contrib "1.2.0-RC3"]
                 [tcrayford_parsley/parsley "0.1.0"]]
  :dev-dependencies [[swank-clojure "1.2.1"]
                     [criterium "0.0.1-SNAPSHOT"]
                     [lein-difftest "1.3.0"]
                     [radagast "1.0.0"]]
  :hooks [leiningen.hooks.difftest])
