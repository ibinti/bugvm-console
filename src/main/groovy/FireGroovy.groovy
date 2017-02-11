class FireGroovy {

    static void main(String... args) {

        println 'Hello Groovy BugVM!'


        String stringFromDatabase = 'Hello ${nameKey}!'.toString()
        String nameString = 'world'

        def engine = new groovy.text.SimpleTemplateEngine()
        def binding = [
                nameKey:nameString
        ]
        def test = engine.createTemplate(stringFromDatabase).make(binding).toString()
        assert 'Hello world!' == test

        println test

    }
}
