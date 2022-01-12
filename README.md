# Cypress Scala Example

This project uses [ScalablyTyped](https://scalablytyped.org/docs/readme) to create [Scala.js](https://www.scala-js.org/) interfaces for the [Cypress](https://www.cypress.io/) web testing framework.

Example:

```bash
$ sbt cypress/run

Opening `/dev/tty` failed (6): Device not configured
================================================================================
  (Run Starting)
  ┌────────────────────────────────────────────────────────────────────────────────────────────────┐
  │ Cypress:    8.7.0                                                                              │
  │ Browser:    Electron 93 (headless)                                                             │
  │ Specs:      1 found (main.js)                                                                  │
  └────────────────────────────────────────────────────────────────────────────────────────────────┘

────────────────────────────────────────────────────────────────────────────────────────────────────
                                                                                                    
  Running:  main.js                                                                         (1 of 1)
Browserslist: caniuse-lite is outdated. Please run:
npx browserslist@latest --update-db

Why you should do it regularly:
https://github.com/browserslist/browserslist#browsers-data-updating


  My First Test
    ✓ finds the content 'type' (38ms)


  1 passing (51ms)


  (Results)

  ┌────────────────────────────────────────────────────────────────────────────────────────────────┐
  │ Tests:        1                                                                                │
  │ Passing:      1                                                                                │
  │ Failing:      0                                                                                │
  │ Pending:      0                                                                                │
  │ Skipped:      0                                                                                │
  │ Screenshots:  0                                                                                │
  │ Video:        true                                                                             │
  │ Duration:     0 seconds                                                                        │
  │ Spec Ran:     main.js                                                                          │
  └────────────────────────────────────────────────────────────────────────────────────────────────┘

  (Video)
  -  Started processing:  Compressing to 32 CRF                                                     
  -  Finished processing: /Users/ericpeters/even/scala-js-cypress-example/cypress/cyp     (1 second)
                          ress/videos/main.js.mp4                                                   

Opening `/dev/tty` failed (6): Device not configured
================================================================================

  (Run Finished)

       Spec                                              Tests  Passing  Failing  Pending  Skipped  
  ┌────────────────────────────────────────────────────────────────────────────────────────────────┐
  │ ✔  main.js                                   50ms        1        1        -        -        - │
  └────────────────────────────────────────────────────────────────────────────────────────────────┘
    ✔  All specs passed!                         50ms        1        1        -        -        -  
[success] Total time: 25 s, completed Jan 12, 2022, 12:05:52 PM
```
