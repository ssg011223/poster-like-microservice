DROP TABLE IF EXISTS public.adom;
CREATE TABLE adom (
                      post_id INTEGER NOT NULL,
                      person_id INTEGER NOT NULL,
                      adom_date TIMESTAMP WITHOUT TIME ZONE NOT NULL
);

ALTER TABLE ONLY adom
    ADD CONSTRAINT pk_adom_id PRIMARY KEY (person_id, post_id);