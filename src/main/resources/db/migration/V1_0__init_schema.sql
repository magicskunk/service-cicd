create table if not exists "user"
(
    id       bigserial    not null,
    username varchar(255) not null,
    constraint pk_user primary key (id)
);

alter table if exists "user"
    add constraint uc_user_username unique (username);

insert into "user" (username)
values ('terminator');
insert into "user" (username)
values ('robocop');
