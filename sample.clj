#!/usr/bin/env bb
(require '[lread.status-line :as status])

(status/line :head "Sample heading")
(status/line :warn "Sample warning")
(status/line :error "Sample errror")

(status/line :head "Multiple line\nheading sample\nhere")
(status/line :warn "Multiple line\nwarning sample\nhere")
(status/line :error "Multiple line\nerror sample\nhere")

(status/line :head "Any %s can use %s args" "message" "replacement")

(status/line :detail "Some plain text detail")

(status/die 1 "Something %s happened" "bad")
