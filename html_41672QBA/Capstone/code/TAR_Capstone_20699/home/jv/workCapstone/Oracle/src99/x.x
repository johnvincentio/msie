Buildfile: build.xml

all:

dbsetup-supplier:
     [echo] creating supplier oracle resources

tools:

create-jdbc-connection-poolpb:
     [exec] create-jdbc-connection-pool --password yetiyeti --secure=false --terse=false --user admin --steadypoolsize 4 --maxpoolsize 4 --target server --property user=JVSUPPLIER:password=capstone:url=jdbc\:oracle\:thin\:@jv2\:1521\:sid1 --echo=true --port 4848 --interactive=true --isolationlevel read-committed --host localhost --datasourceclassname oracle.jdbc.pool.OracleDataSource --restype javax.sql.DataSource SupplierPool
     [exec] Command create-jdbc-connection-pool executed successfully.



create-jdbc-resource:
     [exec] Command create-jdbc-resource executed successfully.



reconfig:
     [echo] Reconfiguring server server



oracle-dbsetup:

dbsetup-distributor:
     [echo] creating distributor oracle resources

tools:

create-jdbc-connection-poolpb:
     [exec] create-jdbc-connection-pool --password yetiyeti --secure=false --terse=false --user admin --steadypoolsize 4 --maxpoolsize 4 --target server --property user=JVDISTRIBUTOR:password=capstone:url=jdbc\:oracle\:thin\:@jv2\:1521\:sid1 --echo=true --port 4848 --interactive=true --isolationlevel read-committed --host localhost --datasourceclassname oracle.jdbc.pool.OracleDataSource --restype javax.sql.DataSource DistributorPool
     [exec] Command create-jdbc-connection-pool executed successfully.



create-jdbc-resource:
     [exec] Command create-jdbc-resource executed successfully.



reconfig:
     [echo] Reconfiguring server server



oracle-dbsetup:

dbsetup-retailer:
     [echo] creating retailer oracle resources

tools:

create-jdbc-connection-poolpb:
     [exec] create-jdbc-connection-pool --password yetiyeti --secure=false --terse=false --user admin --steadypoolsize 4 --maxpoolsize 4 --target server --property user=JVRETAILER:password=capstone:url=jdbc\:oracle\:thin\:@jv2\:1521\:sid1 --echo=true --port 4848 --interactive=true --isolationlevel read-committed --host localhost --datasourceclassname oracle.jdbc.pool.OracleDataSource --restype javax.sql.DataSource RetailerPool
     [exec] Command create-jdbc-connection-pool executed successfully.



create-jdbc-resource:
     [exec] Command create-jdbc-resource executed successfully.



reconfig:
     [echo] Reconfiguring server server



oracle-dbsetup:

dbsetup-manufacturer:
     [echo] creating manufacturer oracle resources

tools:

create-jdbc-connection-poolpb:
     [exec] create-jdbc-connection-pool --password yetiyeti --secure=false --terse=false --user admin --steadypoolsize 4 --maxpoolsize 4 --target server --property user=JVMANUFACTURER:password=capstone:url=jdbc\:oracle\:thin\:@jv2\:1521\:sid1 --echo=true --port 4848 --interactive=true --isolationlevel read-committed --host localhost --datasourceclassname oracle.jdbc.pool.OracleDataSource --restype javax.sql.DataSource ManufacturerPool
     [exec] Command create-jdbc-connection-pool executed successfully.



create-jdbc-resource:
     [exec] Command create-jdbc-resource executed successfully.



reconfig:
     [echo] Reconfiguring server server



oracle-dbsetup:

dbsetup-nero:
     [echo] creating nero oracle resources

tools:

create-jdbc-connection-poolpb:
     [exec] create-jdbc-connection-pool --password yetiyeti --secure=false --terse=false --user admin --steadypoolsize 4 --maxpoolsize 4 --target server --property user=JVNERO:password=capstone:url=jdbc\:oracle\:thin\:@jv2\:1521\:sid1 --echo=true --port 4848 --interactive=true --isolationlevel read-committed --host localhost --datasourceclassname oracle.jdbc.pool.OracleDataSource --restype javax.sql.DataSource NeroPool
     [exec] Command create-jdbc-connection-pool executed successfully.



create-jdbc-resource:
     [exec] Command create-jdbc-resource executed successfully.



reconfig:
     [echo] Reconfiguring server server



oracle-dbsetup:

alldata:

alldata-supplier:
     [echo] creating supplier oracle tables

doOracleSQL:
     [echo] doOracleSQL; user is JVSUPPLIER
     [echo] file is all
     [echo] creating supplier oracle data

doOracleSQL:
     [echo] doOracleSQL; user is JVSUPPLIER
     [echo] file is alldata

alldata-distributor:
     [echo] creating distributor oracle tables

doOracleSQL:
     [echo] doOracleSQL; user is JVDISTRIBUTOR
     [echo] file is all
     [echo] creating distributor oracle data

doOracleSQL:
     [echo] doOracleSQL; user is JVDISTRIBUTOR
     [echo] file is alldata

alldata-retailer:
     [echo] creating retailer oracle tables

doOracleSQL:
     [echo] doOracleSQL; user is JVRETAILER
     [echo] file is all
     [echo] creating retailer oracle data

doOracleSQL:
     [echo] doOracleSQL; user is JVRETAILER
     [echo] file is alldata

alldata-manufacturer:
     [echo] creating manufacturer oracle tables

doOracleSQL:
     [echo] doOracleSQL; user is JVMANUFACTURER
     [echo] file is all
     [echo] creating manufacturer oracle data

doOracleSQL:
     [echo] doOracleSQL; user is JVMANUFACTURER
     [echo] file is alldata

alldata-nero:
     [echo] creating nero oracle tables and data

doOracleSQL:
     [echo] doOracleSQL; user is JVNERO
     [echo] file is all

BUILD SUCCESSFUL
Total time: 3 minutes 16 seconds
