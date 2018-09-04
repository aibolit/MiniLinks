environments {
    development {
        dataSource {
            println System.env
        }
    }   
    production {
        dataSource {
            println System.env
            url = System.env.JDBC_DATABASE_URL
            username = System.env.JDBC_DATABASE_USERNAME
            password = System.env.JDBC_DATABASE_PASSWORD
        }
    }
}