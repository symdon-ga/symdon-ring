(defproject symdon-ring "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "EPL-2.0 OR GPL-2.0-or-later WITH Classpath-exception-2.0"
            :url "https://www.eclipse.org/legal/epl-2.0/"}
  :dependencies [[org.clojure/clojure "1.9.0"]
                 [ring "1.8.0"]
                 [compojure "1.6.1"]]
  :main ^:skip-aot symdon-ring.core
  :repl-options {:init-ns symdon-ring.core}
  :profiles {:uberjar {:aot :all}})

