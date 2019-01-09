insert into USER (id, login, password, name , email, age, user_type) VALUES (1,'user1', '6d932c406fa15164ee48ff5a52f81dae', 'imie_user1','jakismail1@o.pl', 30, 'REGULAR_USER');
insert into USER (id, login, password, name , email, age, user_type) VALUES (2,'user2', 'ed71c5d55af657bc2413020e5580d4dd', 'imie_user2','jakismail2@o.pl', 20, 'REGULAR_USER');
insert into USER (id, login, password, name , email, age, user_type) VALUES (3,'Admin', 'e00cf25ad42683b3df678c61f42c6bda', 'imie_admin','jakismail3@o.pl', 25, 'ADMIN');


insert into FLASHCARD (id, word, word_translation, user_id, list_name) VALUES (1, 'be', 'być', 1, 'lekcja1');
insert into FLASHCARD (id, word, word_translation, user_id, list_name) VALUES (2, 'mother', 'matka', 1, 'lekcja1');
insert into FLASHCARD (id, word, word_translation, user_id, list_name) VALUES (3, 'father', 'ojciec', 1, 'lekcja1');
insert into FLASHCARD (id, word, word_translation, user_id, list_name) VALUES (4, 'one', 'jeden', 1, 'lekcja1');
insert into FLASHCARD (id, word, word_translation, user_id, list_name) VALUES (5, 'travel', 'podróżować', 1, 'lekcja2');
insert into FLASHCARD (id, word, word_translation, user_id, list_name) VALUES (6, 'profession', 'zawód', 1, 'lekcja2');
insert into FLASHCARD (id, word, word_translation, user_id, list_name) VALUES (7, 'work', 'praca (ogólnie)', 1, 'lekcja2');
insert into FLASHCARD (id, word, word_translation, user_id, list_name) VALUES (8, 'job', 'praca (posada)', 1, 'lekcja2');

insert into FLASHCARD (id, word, word_translation, user_id, list_name) VALUES (9, 'ship', 'statek', 2, 'moje1');
insert into FLASHCARD (id, word, word_translation, user_id, list_name) VALUES (10, 'sky', 'niebo', 2, 'moje1');
insert into FLASHCARD (id, word, word_translation, user_id, list_name) VALUES (11, 'twenty-two', 'dwadzieścia dwa', 2, 'moje2');
insert into FLASHCARD (id, word, word_translation, user_id, list_name) VALUES (12, 'engineer', 'inżynier', 2, 'moje2');
