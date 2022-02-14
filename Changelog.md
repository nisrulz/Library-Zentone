# Changelog

## 2.0.0 [14 Feb 2022]

- ✅  Switched to Kotlin
- 👀  Uses coroutines
- 🧹  Reworked API

- ⚠️  `ZenTone`is no more a singleton thus allowing running multiple instances of it.
- ❌  Time duration cannot be set anymore. This is now dependent on when one calls `stop` on `ZenTone` instance.

## 1.0.3 [01 Aug 2016]

- ✅  Updated code to handle volume
- 🧹  Replace maven-push.gradle file with the one from github repo
- 📃  Added Java Docs
- 🧰  Code cleanup and updated dependencies
  