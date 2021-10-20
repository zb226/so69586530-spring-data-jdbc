
## Quick demo for [StackOverflow question 69586530](https://stackoverflow.com/questions/69586530)

Please run

    gradlew bootRun

and find the offending warning in the output:

    (...)
    2021-10-21 00:22:11.794 DEBUG 18348 --- [           main] o.s.jdbc.core.JdbcTemplate               : Executing prepared SQL statement [SELECT "outlet_offeredservice"."ID" AS "ID", "outlet_offeredservice"."OUTLET_ID" AS "OUTLET_ID", "outlet_offeredservice"."id" AS "id" FROM "outlet_offeredservice" WHERE "outlet_offeredservice"."outlet_id" = ?]
    2021-10-21 00:22:11.794 TRACE 18348 --- [           main] o.s.jdbc.core.StatementCreatorUtils      : Setting SQL statement parameter value: column index 1, parameter value [DEF012], value class [java.lang.String], SQL type 12
    2021-10-21 00:22:11.795  WARN 18348 --- [           main] o.s.d.j.core.convert.ResultSetAccessor   : ResultSet contains id multiple times
    2021-10-21 00:22:11.798  WARN 18348 --- [           main] o.s.d.j.core.convert.ResultSetAccessor   : ResultSet contains id multiple times
    OutletOfferedService [id=DEF012-001, outletId=DEF012]
    OutletOfferedService [id=DEF012-002, outletId=DEF012]
    2021-10-21 00:22:11.813  INFO 18348 --- [ionShutdownHook] com.zaxxer.hikari.HikariDataSource       : HikariPool-1 - Shutdown initiated...
    (...)
