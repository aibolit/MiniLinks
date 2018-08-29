package minilinks

class Link {
    String url

    static constraints = {
        url maxSize: 1024
        alias unique: true
    }

    static mapping = {
        id column: "alias", type: 'string'
    }
}
