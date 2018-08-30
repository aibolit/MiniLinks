package minilinks

class Link {
    String url
    String alias

    static constraints = {
        url maxSize: 1024
        alias unique: true
    }

    static mapping = {
        alias index: "alias_ix"
    }
}
