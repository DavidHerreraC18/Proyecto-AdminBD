alter session set "_ORACLE_SCRIPT"=true
CREATE USER AdminBDUser IDENTIFIED BY abcd1234;

GRANT ALL PRIVILEGES TO AdminBDUser;
GRANT "DBA" TO AdminBDUser WITH ADMIN OPTION;
GRANT "DV_MONITOR" TO AdminBDUser WITH ADMIN OPTION;
GRANT "CTXAPP" TO AdminBDUser WITH ADMIN OPTION;
GRANT "DV_AUDIT_CLEANUP" TO AdminBDUser WITH ADMIN OPTION;
GRANT "EM_EXPRESS_ALL" TO AdminBDUser WITH ADMIN OPTION;
GRANT "WM_ADMIN_ROLE" TO AdminBDUser WITH ADMIN OPTION;
GRANT "OLAP_USER" TO AdminBDUser WITH ADMIN OPTION;
GRANT "OLAP_XS_ADMIN" TO AdminBDUser WITH ADMIN OPTION;
GRANT "DV_SECANALYST" TO AdminBDUser WITH ADMIN OPTION;
GRANT "RECOVERY_CATALOG_OWNER_VPD" TO AdminBDUser WITH ADMIN OPTION;
GRANT "XS_CACHE_ADMIN" TO AdminBDUser WITH ADMIN OPTION;
GRANT "GDS_CATALOG_SELECT" TO AdminBDUser WITH ADMIN OPTION;
GRANT "SCHEDULER_ADMIN" TO AdminBDUser WITH ADMIN OPTION;
GRANT "PROVISIONER" TO AdminBDUser WITH ADMIN OPTION;
GRANT "AUDIT_ADMIN" TO AdminBDUser WITH ADMIN OPTION;
GRANT "XDB_WEBSERVICES_OVER_HTTP" TO AdminBDUser WITH ADMIN OPTION;
GRANT "DV_REALM_RESOURCE" TO AdminBDUser WITH ADMIN OPTION;
GRANT "AQ_ADMINISTRATOR_ROLE" TO AdminBDUser WITH ADMIN OPTION;
GRANT "SYSUMF_ROLE" TO AdminBDUser WITH ADMIN OPTION;
GRANT "APPLICATION_TRACE_VIEWER" TO AdminBDUser WITH ADMIN OPTION;
GRANT "XDB_WEBSERVICES" TO AdminBDUser WITH ADMIN OPTION;
GRANT "DV_PUBLIC" TO AdminBDUser WITH ADMIN OPTION;
GRANT "LBAC_DBA" TO AdminBDUser WITH ADMIN OPTION;
GRANT "OPTIMIZER_PROCESSING_RATE" TO AdminBDUser WITH ADMIN OPTION;
GRANT "RECOVERY_CATALOG_USER" TO AdminBDUser WITH ADMIN OPTION;
GRANT "DV_DATAPUMP_NETWORK_LINK" TO AdminBDUser WITH ADMIN OPTION;
GRANT "GSMUSER_ROLE" TO AdminBDUser WITH ADMIN OPTION;
GRANT "GATHER_SYSTEM_STATISTICS" TO AdminBDUser WITH ADMIN OPTION;
GRANT "LOGSTDBY_ADMINISTRATOR" TO AdminBDUser WITH ADMIN OPTION;
GRANT "DBJAVASCRIPT" TO AdminBDUser WITH ADMIN OPTION;
GRANT "GSM_POOLADMIN_ROLE" TO AdminBDUser WITH ADMIN OPTION;
GRANT "DV_ADMIN" TO AdminBDUser WITH ADMIN OPTION;
GRANT "DV_POLICY_OWNER" TO AdminBDUser WITH ADMIN OPTION;
GRANT "HS_ADMIN_ROLE" TO AdminBDUser WITH ADMIN OPTION;
GRANT "XS_SESSION_ADMIN" TO AdminBDUser WITH ADMIN OPTION;
GRANT "DV_GOLDENGATE_ADMIN" TO AdminBDUser WITH ADMIN OPTION;
GRANT "IMP_FULL_DATABASE" TO AdminBDUser WITH ADMIN OPTION;
GRANT "DV_XSTREAM_ADMIN" TO AdminBDUser WITH ADMIN OPTION;
GRANT "DV_PATCH_ADMIN" TO AdminBDUser WITH ADMIN OPTION;
GRANT "GGSYS_ROLE" TO AdminBDUser WITH ADMIN OPTION;
GRANT "DATAPUMP_EXP_FULL_DATABASE" TO AdminBDUser WITH ADMIN OPTION;
GRANT "EJBCLIENT" TO AdminBDUser WITH ADMIN OPTION;
GRANT "HS_ADMIN_EXECUTE_ROLE" TO AdminBDUser WITH ADMIN OPTION;
GRANT "JMXSERVER" TO AdminBDUser WITH ADMIN OPTION;
GRANT "OLAP_DBA" TO AdminBDUser WITH ADMIN OPTION;
GRANT "ADM_PARALLEL_EXECUTE_TASK" TO AdminBDUser WITH ADMIN OPTION;
GRANT "JAVAIDPRIV" TO AdminBDUser WITH ADMIN OPTION;
GRANT "SELECT_CATALOG_ROLE" TO AdminBDUser WITH ADMIN OPTION;
GRANT "JAVADEBUGPRIV" TO AdminBDUser WITH ADMIN OPTION;
GRANT "CONNECT" TO AdminBDUser WITH ADMIN OPTION;
GRANT "DATAPUMP_IMP_FULL_DATABASE" TO AdminBDUser WITH ADMIN OPTION;
GRANT "SODA_APP" TO AdminBDUser WITH ADMIN OPTION;
GRANT "OEM_MONITOR" TO AdminBDUser WITH ADMIN OPTION;
GRANT "GSMADMIN_ROLE" TO AdminBDUser WITH ADMIN OPTION;
GRANT "AQ_USER_ROLE" TO AdminBDUser WITH ADMIN OPTION;
GRANT "JAVAUSERPRIV" TO AdminBDUser WITH ADMIN OPTION;
GRANT "XDB_SET_INVOKER" TO AdminBDUser WITH ADMIN OPTION;
GRANT "RECOVERY_CATALOG_OWNER" TO AdminBDUser WITH ADMIN OPTION;
GRANT "JAVA_ADMIN" TO AdminBDUser WITH ADMIN OPTION;
GRANT "DBFS_ROLE" TO AdminBDUser WITH ADMIN OPTION;
GRANT "PDB_DBA" TO AdminBDUser WITH ADMIN OPTION;
GRANT "RDFCTX_ADMIN" TO AdminBDUser WITH ADMIN OPTION;
GRANT "DV_GOLDENGATE_REDO_ACCESS" TO AdminBDUser WITH ADMIN OPTION;
GRANT "CDB_DBA" TO AdminBDUser WITH ADMIN OPTION;
GRANT "JAVASYSPRIV" TO AdminBDUser WITH ADMIN OPTION;
GRANT "HS_ADMIN_SELECT_ROLE" TO AdminBDUser WITH ADMIN OPTION;
GRANT "AUDIT_VIEWER" TO AdminBDUser WITH ADMIN OPTION;
GRANT "RESOURCE" TO AdminBDUser WITH ADMIN OPTION;
GRANT "DV_OWNER" TO AdminBDUser WITH ADMIN OPTION;
GRANT "XDB_WEBSERVICES_WITH_PUBLIC" TO AdminBDUser WITH ADMIN OPTION;
GRANT "EXECUTE_CATALOG_ROLE" TO AdminBDUser WITH ADMIN OPTION;
GRANT "DATAPATCH_ROLE" TO AdminBDUser WITH ADMIN OPTION;
GRANT "DV_ACCTMGR" TO AdminBDUser WITH ADMIN OPTION;
GRANT "DV_REALM_OWNER" TO AdminBDUser WITH ADMIN OPTION;
GRANT "EXP_FULL_DATABASE" TO AdminBDUser WITH ADMIN OPTION;
GRANT "DBMS_MDX_INTERNAL" TO AdminBDUser WITH ADMIN OPTION;
GRANT "DV_STREAMS_ADMIN" TO AdminBDUser WITH ADMIN OPTION;
GRANT "XS_NAMESPACE_ADMIN" TO AdminBDUser WITH ADMIN OPTION;
GRANT "ORDADMIN" TO AdminBDUser WITH ADMIN OPTION;
GRANT "AUTHENTICATEDUSER" TO AdminBDUser WITH ADMIN OPTION;
GRANT "CAPTURE_ADMIN" TO AdminBDUser WITH ADMIN OPTION;
GRANT "OEM_ADVISOR" TO AdminBDUser WITH ADMIN OPTION;
GRANT "XS_CONNECT" TO AdminBDUser WITH ADMIN OPTION;
GRANT "XDBADMIN" TO AdminBDUser WITH ADMIN OPTION;
GRANT "EM_EXPRESS_BASIC" TO AdminBDUser WITH ADMIN OPTION;

-- SYSTEM PRIVILEGES
GRANT CREATE JOB TO AdminBDUser WITH ADMIN OPTION;
GRANT DROP ANY CONTEXT TO AdminBDUser WITH ADMIN OPTION;
GRANT UPDATE ANY CUBE TO AdminBDUser WITH ADMIN OPTION;
GRANT ALTER ANY ANALYTIC VIEW TO AdminBDUser WITH ADMIN OPTION;
GRANT DROP ANY TRIGGER TO AdminBDUser WITH ADMIN OPTION;
GRANT DROP ANY SQL TRANSLATION PROFILE TO AdminBDUser WITH ADMIN OPTION;
GRANT MANAGE ANY FILE GROUP TO AdminBDUser WITH ADMIN OPTION;
GRANT ALTER PUBLIC DATABASE LINK TO AdminBDUser WITH ADMIN OPTION;
GRANT MANAGE FILE GROUP TO AdminBDUser WITH ADMIN OPTION;
GRANT ALTER ANY INDEX TO AdminBDUser WITH ADMIN OPTION;
GRANT DROP ANY SEQUENCE TO AdminBDUser WITH ADMIN OPTION;
GRANT ALTER PROFILE TO AdminBDUser WITH ADMIN OPTION;
GRANT INHERIT ANY PRIVILEGES TO AdminBDUser WITH ADMIN OPTION;
GRANT UNDER ANY TABLE TO AdminBDUser WITH ADMIN OPTION;
GRANT KEEP SYSGUID TO AdminBDUser WITH ADMIN OPTION;
GRANT CREATE ASSEMBLY TO AdminBDUser WITH ADMIN OPTION;
GRANT DROP ANY LIBRARY TO AdminBDUser WITH ADMIN OPTION;
GRANT ALTER ANY EDITION TO AdminBDUser WITH ADMIN OPTION;
GRANT CREATE ROLE TO AdminBDUser WITH ADMIN OPTION;
GRANT CREATE LIBRARY TO AdminBDUser WITH ADMIN OPTION;
GRANT DROP ROLLBACK SEGMENT TO AdminBDUser WITH ADMIN OPTION;
GRANT CREATE TRIGGER TO AdminBDUser WITH ADMIN OPTION;
GRANT ALTER ANY PROCEDURE TO AdminBDUser WITH ADMIN OPTION;
GRANT ADMINISTER DATABASE TRIGGER TO AdminBDUser WITH ADMIN OPTION;
GRANT DROP ANY MEASURE FOLDER TO AdminBDUser WITH ADMIN OPTION;
GRANT CREATE ANY PROCEDURE TO AdminBDUser WITH ADMIN OPTION;
GRANT ALTER ANY OUTLINE TO AdminBDUser WITH ADMIN OPTION;
GRANT CREATE ANY ANALYTIC VIEW TO AdminBDUser WITH ADMIN OPTION;
GRANT EXECUTE ANY INDEXTYPE TO AdminBDUser WITH ADMIN OPTION;
GRANT USE ANY JOB RESOURCE TO AdminBDUser WITH ADMIN OPTION;
GRANT CREATE ANY DIRECTORY TO AdminBDUser WITH ADMIN OPTION;
GRANT ALTER ANY RULE SET TO AdminBDUser WITH ADMIN OPTION;
GRANT USE ANY SQL TRANSLATION PROFILE TO AdminBDUser WITH ADMIN OPTION;
GRANT ALTER ANY MINING MODEL TO AdminBDUser WITH ADMIN OPTION;
GRANT DEBUG CONNECT SESSION TO AdminBDUser WITH ADMIN OPTION;
GRANT LOGMINING TO AdminBDUser WITH ADMIN OPTION;
GRANT DROP ANY ATTRIBUTE DIMENSION TO AdminBDUser WITH ADMIN OPTION;
GRANT CREATE ANY MINING MODEL TO AdminBDUser WITH ADMIN OPTION;
GRANT CREATE LOCKDOWN PROFILE TO AdminBDUser WITH ADMIN OPTION;
GRANT ALTER SESSION TO AdminBDUser WITH ADMIN OPTION;
GRANT CREATE MATERIALIZED VIEW TO AdminBDUser WITH ADMIN OPTION;
GRANT CREATE PLUGGABLE DATABASE TO AdminBDUser WITH ADMIN OPTION;
GRANT DROP ANY ANALYTIC VIEW TO AdminBDUser WITH ADMIN OPTION;
GRANT WRITE ANY ANALYTIC VIEW CACHE TO AdminBDUser WITH ADMIN OPTION;
GRANT MERGE ANY VIEW TO AdminBDUser WITH ADMIN OPTION;
GRANT CREATE ANY INDEX TO AdminBDUser WITH ADMIN OPTION;
GRANT READ ANY ANALYTIC VIEW CACHE TO AdminBDUser WITH ADMIN OPTION;
GRANT CREATE DIMENSION TO AdminBDUser WITH ADMIN OPTION;
GRANT EXECUTE ANY RULE SET TO AdminBDUser WITH ADMIN OPTION;
GRANT CREATE SQL TRANSLATION PROFILE TO AdminBDUser WITH ADMIN OPTION;
GRANT ALTER ANY MATERIALIZED VIEW TO AdminBDUser WITH ADMIN OPTION;
GRANT AUDIT SYSTEM TO AdminBDUser WITH ADMIN OPTION;
GRANT CREATE OPERATOR TO AdminBDUser WITH ADMIN OPTION;
GRANT MANAGE ANY QUEUE TO AdminBDUser WITH ADMIN OPTION;
GRANT ALTER ANY SQL PROFILE TO AdminBDUser WITH ADMIN OPTION;
GRANT GRANT ANY OBJECT PRIVILEGE TO AdminBDUser WITH ADMIN OPTION;
GRANT CREATE INDEXTYPE TO AdminBDUser WITH ADMIN OPTION;
GRANT AUDIT ANY TO AdminBDUser WITH ADMIN OPTION;
GRANT INHERIT ANY REMOTE PRIVILEGES TO AdminBDUser WITH ADMIN OPTION;
GRANT SYSKM TO AdminBDUser WITH ADMIN OPTION;
GRANT DEBUG ANY PROCEDURE TO AdminBDUser WITH ADMIN OPTION;
GRANT CREATE ANY MEASURE FOLDER TO AdminBDUser WITH ADMIN OPTION;
GRANT CREATE ANY SEQUENCE TO AdminBDUser WITH ADMIN OPTION;
GRANT CREATE MEASURE FOLDER TO AdminBDUser WITH ADMIN OPTION;
GRANT UPDATE ANY CUBE BUILD PROCESS TO AdminBDUser WITH ADMIN OPTION;
GRANT CREATE VIEW TO AdminBDUser WITH ADMIN OPTION;
GRANT ALTER DATABASE LINK TO AdminBDUser WITH ADMIN OPTION;
GRANT ALTER ANY ASSEMBLY TO AdminBDUser WITH ADMIN OPTION;
GRANT ALTER ANY SQL TRANSLATION PROFILE TO AdminBDUser WITH ADMIN OPTION;
GRANT CREATE ANY EVALUATION CONTEXT TO AdminBDUser WITH ADMIN OPTION;
GRANT SELECT ANY MINING MODEL TO AdminBDUser WITH ADMIN OPTION;
GRANT SYSRAC TO AdminBDUser WITH ADMIN OPTION;
GRANT DELETE ANY CUBE DIMENSION TO AdminBDUser WITH ADMIN OPTION;
GRANT ALTER ANY TABLE TO AdminBDUser WITH ADMIN OPTION;
GRANT ALTER ANY ATTRIBUTE DIMENSION TO AdminBDUser WITH ADMIN OPTION;
GRANT CREATE SESSION TO AdminBDUser WITH ADMIN OPTION;
GRANT CREATE RULE TO AdminBDUser WITH ADMIN OPTION;
GRANT BECOME USER TO AdminBDUser WITH ADMIN OPTION;
GRANT SELECT ANY CUBE BUILD PROCESS TO AdminBDUser WITH ADMIN OPTION;
GRANT SELECT ANY TABLE TO AdminBDUser WITH ADMIN OPTION;
GRANT INSERT ANY MEASURE FOLDER TO AdminBDUser WITH ADMIN OPTION;
GRANT CREATE ANY SQL PROFILE TO AdminBDUser WITH ADMIN OPTION;
GRANT FORCE ANY TRANSACTION TO AdminBDUser WITH ADMIN OPTION;
GRANT DELETE ANY TABLE TO AdminBDUser WITH ADMIN OPTION;
GRANT ALTER ANY SEQUENCE TO AdminBDUser WITH ADMIN OPTION;
GRANT SELECT ANY CUBE DIMENSION TO AdminBDUser WITH ADMIN OPTION;
GRANT CREATE ANY EDITION TO AdminBDUser WITH ADMIN OPTION;
GRANT CREATE EXTERNAL JOB TO AdminBDUser WITH ADMIN OPTION;
GRANT EM EXPRESS CONNECT TO AdminBDUser WITH ADMIN OPTION;
GRANT DROP ANY MATERIALIZED VIEW TO AdminBDUser WITH ADMIN OPTION;
GRANT CREATE ANY CUBE BUILD PROCESS TO AdminBDUser WITH ADMIN OPTION;
GRANT FLASHBACK ANY TABLE TO AdminBDUser WITH ADMIN OPTION;
GRANT DROP ANY RULE SET TO AdminBDUser WITH ADMIN OPTION;
GRANT BACKUP ANY TABLE TO AdminBDUser WITH ADMIN OPTION;
GRANT ALTER ANY CUBE TO AdminBDUser WITH ADMIN OPTION;
GRANT CREATE CREDENTIAL TO AdminBDUser WITH ADMIN OPTION;
GRANT CREATE TABLE TO AdminBDUser WITH ADMIN OPTION;
GRANT EXECUTE ANY LIBRARY TO AdminBDUser WITH ADMIN OPTION;
GRANT DROP ANY OUTLINE TO AdminBDUser WITH ADMIN OPTION;
GRANT EXECUTE ASSEMBLY TO AdminBDUser WITH ADMIN OPTION;
GRANT CREATE ANY HIERARCHY TO AdminBDUser WITH ADMIN OPTION;
GRANT CREATE ANALYTIC VIEW TO AdminBDUser WITH ADMIN OPTION;
GRANT CREATE ANY DIMENSION TO AdminBDUser WITH ADMIN OPTION;
GRANT DROP ANY TABLE TO AdminBDUser WITH ADMIN OPTION;
GRANT ADMINISTER KEY MANAGEMENT TO AdminBDUser WITH ADMIN OPTION;
GRANT ALTER ANY CLUSTER TO AdminBDUser WITH ADMIN OPTION;
GRANT EXECUTE ANY CLASS TO AdminBDUser WITH ADMIN OPTION;
GRANT ALTER ANY CUBE BUILD PROCESS TO AdminBDUser WITH ADMIN OPTION;
GRANT CREATE ANY CREDENTIAL TO AdminBDUser WITH ADMIN OPTION;
GRANT DROP ANY DIMENSION TO AdminBDUser WITH ADMIN OPTION;
GRANT SYSBACKUP TO AdminBDUser WITH ADMIN OPTION;
GRANT CREATE ANY RULE SET TO AdminBDUser WITH ADMIN OPTION;
GRANT SELECT ANY SEQUENCE TO AdminBDUser WITH ADMIN OPTION;
GRANT UNDER ANY TYPE TO AdminBDUser WITH ADMIN OPTION;
GRANT MANAGE TABLESPACE TO AdminBDUser WITH ADMIN OPTION;
GRANT DROP ANY OPERATOR TO AdminBDUser WITH ADMIN OPTION;
GRANT CREATE ANY OPERATOR TO AdminBDUser WITH ADMIN OPTION;
GRANT DROP ANY HIERARCHY TO AdminBDUser WITH ADMIN OPTION;
GRANT EXEMPT IDENTITY POLICY TO AdminBDUser WITH ADMIN OPTION;
GRANT CREATE TYPE TO AdminBDUser WITH ADMIN OPTION;
GRANT CREATE TABLESPACE TO AdminBDUser WITH ADMIN OPTION;
GRANT SELECT ANY TRANSACTION TO AdminBDUser WITH ADMIN OPTION;
GRANT DELETE ANY MEASURE FOLDER TO AdminBDUser WITH ADMIN OPTION;
GRANT CREATE ANY CUBE TO AdminBDUser WITH ADMIN OPTION;
GRANT LOCK ANY TABLE TO AdminBDUser WITH ADMIN OPTION;
GRANT CREATE EVALUATION CONTEXT TO AdminBDUser WITH ADMIN OPTION;
GRANT DROP ANY TYPE TO AdminBDUser WITH ADMIN OPTION;
GRANT ADVISOR TO AdminBDUser WITH ADMIN OPTION;
GRANT CREATE PUBLIC DATABASE LINK TO AdminBDUser WITH ADMIN OPTION;
GRANT ANALYZE ANY TO AdminBDUser WITH ADMIN OPTION;
GRANT CREATE ATTRIBUTE DIMENSION TO AdminBDUser WITH ADMIN OPTION;
GRANT DROP ANY RULE TO AdminBDUser WITH ADMIN OPTION;
GRANT INSERT ANY CUBE DIMENSION TO AdminBDUser WITH ADMIN OPTION;
GRANT CREATE ROLLBACK SEGMENT TO AdminBDUser WITH ADMIN OPTION;
GRANT CREATE ANY JOB TO AdminBDUser WITH ADMIN OPTION;
GRANT ALTER USER TO AdminBDUser WITH ADMIN OPTION;
GRANT QUERY REWRITE TO AdminBDUser WITH ADMIN OPTION;
GRANT SELECT ANY DICTIONARY TO AdminBDUser WITH ADMIN OPTION;
GRANT CREATE PUBLIC SYNONYM TO AdminBDUser WITH ADMIN OPTION;
GRANT GLOBAL QUERY REWRITE TO AdminBDUser WITH ADMIN OPTION;
GRANT ALTER ANY CUBE DIMENSION TO AdminBDUser WITH ADMIN OPTION;
GRANT CREATE ANY CUBE DIMENSION TO AdminBDUser WITH ADMIN OPTION;
GRANT DROP ANY CLUSTER TO AdminBDUser WITH ADMIN OPTION;
GRANT CREATE ANY RULE TO AdminBDUser WITH ADMIN OPTION;
GRANT UPDATE ANY CUBE DIMENSION TO AdminBDUser WITH ADMIN OPTION;
GRANT SYSDBA TO AdminBDUser WITH ADMIN OPTION;
GRANT ADMINISTER RESOURCE MANAGER TO AdminBDUser WITH ADMIN OPTION;
GRANT CREATE ANY SYNONYM TO AdminBDUser WITH ADMIN OPTION;
GRANT DROP ANY SYNONYM TO AdminBDUser WITH ADMIN OPTION;
GRANT DROP ANY MINING MODEL TO AdminBDUser WITH ADMIN OPTION;
GRANT EXECUTE ANY PROCEDURE TO AdminBDUser WITH ADMIN OPTION;
GRANT CREATE SYNONYM TO AdminBDUser WITH ADMIN OPTION;
GRANT SET CONTAINER TO AdminBDUser WITH ADMIN OPTION;
GRANT EXECUTE ANY PROGRAM TO AdminBDUser WITH ADMIN OPTION;
GRANT EXEMPT REDACTION POLICY TO AdminBDUser WITH ADMIN OPTION;
GRANT EXECUTE ANY TYPE TO AdminBDUser WITH ADMIN OPTION;
GRANT ON COMMIT REFRESH TO AdminBDUser WITH ADMIN OPTION;
GRANT DEBUG CONNECT ANY TO AdminBDUser WITH ADMIN OPTION;
GRANT CREATE SEQUENCE TO AdminBDUser WITH ADMIN OPTION;
GRANT CREATE HIERARCHY TO AdminBDUser WITH ADMIN OPTION;
GRANT SELECT ANY MEASURE FOLDER TO AdminBDUser WITH ADMIN OPTION;
GRANT COMMENT ANY MINING MODEL TO AdminBDUser WITH ADMIN OPTION;
GRANT ADMINISTER SQL TUNING SET TO AdminBDUser WITH ADMIN OPTION;
GRANT SYSOPER TO AdminBDUser WITH ADMIN OPTION;
GRANT CREATE ANY INDEXTYPE TO AdminBDUser WITH ADMIN OPTION;
GRANT KEEP DATE TIME TO AdminBDUser WITH ADMIN OPTION;
GRANT DROP ANY INDEX TO AdminBDUser WITH ADMIN OPTION;
GRANT RESTRICTED SESSION TO AdminBDUser WITH ADMIN OPTION;
GRANT SYSDG TO AdminBDUser WITH ADMIN OPTION;
GRANT DEQUEUE ANY QUEUE TO AdminBDUser WITH ADMIN OPTION;
GRANT ANALYZE ANY DICTIONARY TO AdminBDUser WITH ADMIN OPTION;
GRANT ALTER ANY INDEXTYPE TO AdminBDUser WITH ADMIN OPTION;
GRANT TRANSLATE ANY SQL TO AdminBDUser WITH ADMIN OPTION;
GRANT ADMINISTER ANY SQL TUNING SET TO AdminBDUser WITH ADMIN OPTION;
GRANT CREATE USER TO AdminBDUser WITH ADMIN OPTION;
GRANT EXECUTE ANY OPERATOR TO AdminBDUser WITH ADMIN OPTION;
GRANT CREATE CUBE BUILD PROCESS TO AdminBDUser WITH ADMIN OPTION;
GRANT CREATE PROFILE TO AdminBDUser WITH ADMIN OPTION;
GRANT ALTER ANY ROLE TO AdminBDUser WITH ADMIN OPTION;
GRANT UPDATE ANY TABLE TO AdminBDUser WITH ADMIN OPTION;
GRANT ALTER ANY LIBRARY TO AdminBDUser WITH ADMIN OPTION;
GRANT DROP ANY VIEW TO AdminBDUser WITH ADMIN OPTION;
GRANT CREATE ANY CLUSTER TO AdminBDUser WITH ADMIN OPTION;
GRANT EXECUTE ANY RULE TO AdminBDUser WITH ADMIN OPTION;
GRANT ALTER TABLESPACE TO AdminBDUser WITH ADMIN OPTION;
GRANT UNDER ANY VIEW TO AdminBDUser WITH ADMIN OPTION;
GRANT EXECUTE ANY ASSEMBLY TO AdminBDUser WITH ADMIN OPTION;
GRANT GRANT ANY PRIVILEGE TO AdminBDUser WITH ADMIN OPTION;
GRANT ALTER ANY TRIGGER TO AdminBDUser WITH ADMIN OPTION;
GRANT CREATE ANY VIEW TO AdminBDUser WITH ADMIN OPTION;
GRANT ALTER LOCKDOWN PROFILE TO AdminBDUser WITH ADMIN OPTION;
GRANT EXPORT FULL DATABASE TO AdminBDUser WITH ADMIN OPTION;
GRANT ALTER ANY MEASURE FOLDER TO AdminBDUser WITH ADMIN OPTION;
GRANT ALTER ANY EVALUATION CONTEXT TO AdminBDUser WITH ADMIN OPTION;
GRANT TEXT DATASTORE ACCESS TO AdminBDUser WITH ADMIN OPTION;
GRANT FLASHBACK ARCHIVE ADMINISTER TO AdminBDUser WITH ADMIN OPTION;
GRANT IMPORT FULL DATABASE TO AdminBDUser WITH ADMIN OPTION;
GRANT CREATE ANY OUTLINE TO AdminBDUser WITH ADMIN OPTION;
GRANT COMMENT ANY TABLE TO AdminBDUser WITH ADMIN OPTION;
GRANT READ ANY TABLE TO AdminBDUser WITH ADMIN OPTION;
GRANT CREATE DATABASE LINK TO AdminBDUser WITH ADMIN OPTION;
GRANT DROP PUBLIC SYNONYM TO AdminBDUser WITH ADMIN OPTION;
GRANT DROP USER TO AdminBDUser WITH ADMIN OPTION;
GRANT CHANGE NOTIFICATION TO AdminBDUser WITH ADMIN OPTION;
GRANT CREATE MINING MODEL TO AdminBDUser WITH ADMIN OPTION;
GRANT INSERT ANY TABLE TO AdminBDUser WITH ADMIN OPTION;
GRANT DROP LOCKDOWN PROFILE TO AdminBDUser WITH ADMIN OPTION;
GRANT DROP PROFILE TO AdminBDUser WITH ADMIN OPTION;
GRANT CREATE ANY MATERIALIZED VIEW TO AdminBDUser WITH ADMIN OPTION;
GRANT CREATE RULE SET TO AdminBDUser WITH ADMIN OPTION;
GRANT EXEMPT ACCESS POLICY TO AdminBDUser WITH ADMIN OPTION;
GRANT MANAGE SCHEDULER TO AdminBDUser WITH ADMIN OPTION;
GRANT READ ANY FILE GROUP TO AdminBDUser WITH ADMIN OPTION;
GRANT FORCE TRANSACTION TO AdminBDUser WITH ADMIN OPTION;
GRANT DROP ANY CUBE BUILD PROCESS TO AdminBDUser WITH ADMIN OPTION;
GRANT ALTER ANY TYPE TO AdminBDUser WITH ADMIN OPTION;
GRANT DROP ANY PROCEDURE TO AdminBDUser WITH ADMIN OPTION;
GRANT CREATE ANY SQL TRANSLATION PROFILE TO AdminBDUser WITH ADMIN OPTION;
GRANT DROP PUBLIC DATABASE LINK TO AdminBDUser WITH ADMIN OPTION;
GRANT DROP ANY INDEXTYPE TO AdminBDUser WITH ADMIN OPTION;
GRANT DROP ANY SQL PROFILE TO AdminBDUser WITH ADMIN OPTION;
GRANT ALTER SYSTEM TO AdminBDUser WITH ADMIN OPTION;
GRANT UNLIMITED TABLESPACE TO AdminBDUser WITH ADMIN OPTION;
GRANT DROP ANY ROLE TO AdminBDUser WITH ADMIN OPTION;
GRANT ALTER ANY DIMENSION TO AdminBDUser WITH ADMIN OPTION;
GRANT DROP ANY CUBE DIMENSION TO AdminBDUser WITH ADMIN OPTION;
GRANT DROP ANY CUBE TO AdminBDUser WITH ADMIN OPTION;
GRANT CREATE ANY TRIGGER TO AdminBDUser WITH ADMIN OPTION;
GRANT DROP ANY ASSEMBLY TO AdminBDUser WITH ADMIN OPTION;
GRANT CREATE ANY TABLE TO AdminBDUser WITH ADMIN OPTION;
GRANT ADMINISTER SQL MANAGEMENT OBJECT TO AdminBDUser WITH ADMIN OPTION;
GRANT DROP ANY DIRECTORY TO AdminBDUser WITH ADMIN OPTION;
GRANT ENQUEUE ANY QUEUE TO AdminBDUser WITH ADMIN OPTION;
GRANT DROP ANY EVALUATION CONTEXT TO AdminBDUser WITH ADMIN OPTION;
GRANT CREATE ANY ASSEMBLY TO AdminBDUser WITH ADMIN OPTION;
GRANT CREATE ANY TYPE TO AdminBDUser WITH ADMIN OPTION;
GRANT REDEFINE ANY TABLE TO AdminBDUser WITH ADMIN OPTION;
GRANT CREATE CLUSTER TO AdminBDUser WITH ADMIN OPTION;
GRANT CREATE ANY CONTEXT TO AdminBDUser WITH ADMIN OPTION;
GRANT EXECUTE ANY EVALUATION CONTEXT TO AdminBDUser WITH ADMIN OPTION;
GRANT RESUMABLE TO AdminBDUser WITH ADMIN OPTION;
GRANT CREATE ANY LIBRARY TO AdminBDUser WITH ADMIN OPTION;
GRANT DROP ANY EDITION TO AdminBDUser WITH ADMIN OPTION;
GRANT CREATE PROCEDURE TO AdminBDUser WITH ADMIN OPTION;
GRANT ALTER DATABASE TO AdminBDUser WITH ADMIN OPTION;
GRANT SELECT ANY CUBE TO AdminBDUser WITH ADMIN OPTION;
GRANT GRANT ANY ROLE TO AdminBDUser WITH ADMIN OPTION;
GRANT ALTER ANY RULE TO AdminBDUser WITH ADMIN OPTION;
GRANT CREATE ANY ATTRIBUTE DIMENSION TO AdminBDUser WITH ADMIN OPTION;
GRANT CREATE CUBE DIMENSION TO AdminBDUser WITH ADMIN OPTION;
GRANT ALTER ANY OPERATOR TO AdminBDUser WITH ADMIN OPTION;
GRANT CREATE CUBE TO AdminBDUser WITH ADMIN OPTION;
GRANT ALTER RESOURCE COST TO AdminBDUser WITH ADMIN OPTION;
GRANT ALTER ANY HIERARCHY TO AdminBDUser WITH ADMIN OPTION;
GRANT DROP TABLESPACE TO AdminBDUser WITH ADMIN OPTION;
GRANT ALTER ROLLBACK SEGMENT TO AdminBDUser WITH ADMIN OPTION;
GRANT PURGE DBA_RECYCLEBIN TO AdminBDUser WITH ADMIN OPTION;
GRANT CREATE session TO AdminBDUser;

CREATE USER ElCaro IDENTIFIED BY abcd1234;
GRANT CREATE session TO ElCaro;

CREATE USER DBOUser IDENTIFIED BY abcd1234;
GRANT CREATE session TO DBOUser;

GRANT CREATE TABLE TO ElCaro;
GRANT CREATE ANY JOB TO ElCaro;



create table ElCaro.Estudiante (
  codigoEstudiante number PRIMARY KEY, 
  nombres varchar2(200) NOT NULL, 
  apellidos varchar2(200) NOT NULL, 
  fecha_nacimiento date NOT NULL, 
  tipoDocumento varchar2(200) DEFAULT('CC'), 
  documento number(12,0),
  CONSTRAINT user_info UNIQUE(tipoDocumento, documento)
);

create table ElCaro.Materia (
 codigoMateria number PRIMARY KEY, 
 nombreMateria varchar2(200), 
 creditos INT CHECK(creditos>=1 AND creditos<=5)
);

create table ElCaro.Nota (
  codigoEstudiante number, 
  codigoMateria number, 
  semestre varchar2(200), 
  nota number(2,0),
  CONSTRAINT fk_estudiante
    FOREIGN KEY (codigoEstudiante)
    REFERENCES ElCaro.Estudiante(codigoEstudiante),
  CONSTRAINT fk_materia
    FOREIGN KEY (codigoMateria)
    REFERENCES ElCaro.Materia (codigoMateria),
  PRIMARY KEY (codigoEstudiante, codigoMateria)
);

COMMENT ON TABLE ElCaro.Estudiante IS 'Tablita de estudiantes';
COMMENT ON COLUMN ElCaro.Estudiante.nombres IS 'nombres de estudiantes';
COMMENT ON COLUMN ElCaro.Estudiante.apellidos IS 'apellidos de estudiantes';
COMMENT ON COLUMN ElCaro.Estudiante.documento IS 'documento de estudiantes';
COMMENT ON TABLE ElCaro.Materia IS 'Tablita de materia';
COMMENT ON COLUMN ElCaro.Materia.codigoMateria IS 'Codigo de la materia';
COMMENT ON TABLE ElCaro.Nota IS 'Tablita de nota';
COMMENT ON COLUMN ElCaro.Nota.semestre IS 'semestre de la nota';

CREATE UNIQUE INDEX est_unique_index ON ElCaro.Estudiante (nombres);
CREATE UNIQUE INDEX ape_unique_index ON ElCaro.Estudiante (apellidos);

GRANT INSERT ON ElCaro.Estudiante TO DBOUser;
GRANT ALTER ON ElCaro.Estudiante TO DBOUser;
GRANT READ ON ElCaro.Estudiante TO DBOUser;
GRANT SELECT ON ElCaro.Estudiante TO DBOUser;

GRANT INSERT ON ElCaro.Materia TO DBOUser;
GRANT ALTER ON ElCaro.Materia TO DBOUser;
GRANT READ ON ElCaro.Materia TO DBOUser;
GRANT SELECT ON ElCaro.Materia TO DBOUser;

GRANT INSERT ON ElCaro.Nota TO DBOUser;
GRANT ALTER ON ElCaro.Nota TO DBOUser;
GRANT READ ON ElCaro.Nota TO DBOUser;
GRANT SELECT ON ElCaro.Nota TO DBOUser;



CREATE OR REPLACE PACKAGE AdminBDUser.paquete_proy1 AS
   PROCEDURE creditos;
END paquete_proy1;
/

CREATE OR REPLACE PACKAGE BODY AdminBDUser.paquete_proy1 AS
   PROCEDURE creditos IS
   cre ElCaro.Materia.creditos%TYPE;
   BEGIN
     SELECT creditos INTO cre
     FROM ElCaro.Materia;
   END;
END paquete_proy1;
/

GRANT CONNECT, RESOURCE TO AdminBDUser;
Grant UNLIMITED TABLESPACE TO AdminBDUser;
ALTER USER AdminBDUser quota 100M on USERS;
CREATE OR REPLACE PROCEDURE AdminBDUser.mi_procedimiento 

IS

  i number := 0;

BEGIN

    FOR i IN REVERSE 1..100 LOOP 
        INSERT INTO ElCaro.Materia values (i, 'Paquita',3);
        COMMIT;

    END LOOP;
 
END;
/

CREATE OR REPLACE FUNCTION AdminBDUser.fun1
RETURN number IS 
   total number(2) := 0; 
BEGIN 
   SELECT count(creditos) into total 
   FROM ElCaro.Materia; 
    
   RETURN total; 
END; 
/
CREATE OR REPLACE FUNCTION AdminBDUser.fun2
RETURN number IS 
   total number(2) := 0; 
BEGIN 
   SELECT count(creditos) into total 
   FROM ElCaro.Materia; 
    
   RETURN total; 
END; 
/
CREATE OR REPLACE FUNCTION AdminBDUser.fun3
RETURN number IS 
   total number(2) := 0; 
BEGIN 
   SELECT count(creditos) into total 
   FROM ElCaro.Materia; 
    
   RETURN total; 
END; 
/
GRANT CREATE TABLESPACE TO AdminBDUser;
create tablespace tbs1 

DATAFILE 'D:\David\product\18.0.0\oradata\XE\PROYECTOBD.DBF' 

SIZE 5M;

ALTER USER DBOUser IDENTIFIED BY abcd1234
DEFAULT TABLESPACE tbs1;

create table DBOUser.EstudianteMejorado (
  codigoEstudiante number PRIMARY KEY, 
  nombres varchar2(200) NOT NULL, 
  apellidos varchar2(200) NOT NULL, 
  fecha_nacimiento date NOT NULL, 
  tipoDocumento varchar2(200) DEFAULT('CC'), 
  documento number(12,0),
  CONSTRAINT user_info UNIQUE(tipoDocumento, documento)
) TABLESPACE tbs1;
CREATE UNIQUE INDEX estmej_unique_index ON DBOUser.EstudianteMejorado (nombres);
CREATE UNIQUE INDEX apemej_unique_index ON DBOUser.EstudianteMejorado (apellidos);