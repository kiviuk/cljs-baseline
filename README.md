# Baseline cljs

Baseline installation for cljs

```sh
# Install react
npm install react
npm install react-dom
npm install react-devtools
```

```sh
# Select node lts
sudo n lts
or
sudo n latest (currently v17.9.0)
```

## REPL stuff

```sh
# Start REPL server
shadow-cljs server

# Code Hot Reload (main.js)
shadow-cljs watch app

# Compile app
shadow-cljs compile app

# Connect to plain REPL
rlwrap shadow-cljs cljs-repl app
```
