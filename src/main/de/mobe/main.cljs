(ns de.mobe.main
  (:require [reagent.dom :as r]
            )
  )

(defn main-component []
  [:div
   [:h1 "This is a component!"]
   ])

(defn mount [c]
  (r/render [c] (.getElementById js/document "app"))
  )

;; start is called by init and after code reloading finishes
(defn ^:dev/after-load start []
  (mount main-component)
  (js/console.log "start!!"))

(defn reload! []
  (mount main-component)
  (print "Hello reload!"))

(defn main! []
  ;; init is called ONCE when the page loads
  ;; this is called in the index.html and must be exported
  ;; so it is available even in :advanced release builds
  (js/console.log "main!")
  (start))

;; this is called before any code is reloaded
(defn ^:dev/before-load stop []
  (js/console.log "stop"))

