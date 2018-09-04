environments {
    development {
        dataSource {
            println System.env
        }
    }   
    production {
        dataSource {
            println System.env
            def uri = new URI(System.env.CLEARDB_DATABASE_URL)
            url = "jdbc:mysql://" + uri.host + ":" + uri.port + uri.path + "?" + uri.query
            username = uri.userInfo.split(":")[0]
            password = uri.userInfo.split(":")[1]
        }
    }
}