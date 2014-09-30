# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table word (
  id                        bigint not null,
  content                   varchar(255),
  location                  integer,
  size                      integer,
  color                     varchar(255),
  constraint pk_word primary key (id))
;

create sequence word_seq;




# --- !Downs

SET REFERENTIAL_INTEGRITY FALSE;

drop table if exists word;

SET REFERENTIAL_INTEGRITY TRUE;

drop sequence if exists word_seq;

