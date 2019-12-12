(ns symdon-ring.core
  (:gen-class)
  (:require [compojure.core :refer [routes defroutes context GET]]
            [compojure.route :as route]
            [ring.adapter.jetty :as server]
            [ring.util.response :as res]))


(defn handler [req]
  {:status 200
   :headers {"Content-Type" "text/plain"}
   :body "Hello, world"})

(defonce server (atom nil))

(defn start-server []
  (when-not @server
    (reset! server (server/run-jetty #'handler {:port 3131 :join? false}))))

(defn stop-server []
  (when @server
    (.stop @server)
    (reset! server nil)))

(defn restart-server []
  (when @server
    (stop-server)
    (start-server)))

(defn -main
  "I don't do a whole lot."
  [& args]
  (println "Starting...")
  (start-server))

