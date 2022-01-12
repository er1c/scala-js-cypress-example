import typings.cypress.global.{cy, describe, it}

object Main extends App {
  describe("My First Test", (suite) => {
    it("finds the content 'type'", (ctx, done) => {
      cy.visit("https://example.cypress.io");
      cy.contains("type")
      done(())
    })
  })
}
