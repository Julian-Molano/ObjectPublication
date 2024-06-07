package codeinnnova.ObjectPublication.entities;

import jakarta.persistence.*;

import java.lang.reflect.Array;

@Entity
    @Table(name = "Requirements Publication")
    public class Publication {

        //atributos

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)

        private Long Id; // Id de la publicacion, nro de publicacion
        private int author; // número de usuario que elabora la publicacion
        private String title; // titulo de la publicacion, max 50 caracteres
        private String body; // cuerpo de la publicacion, max 500 caracteres
        private String[] multimedia; //URL de la imagen o video
        private String[] tags; // obligatorio mínimo 1 etiqueta
        private int like; // like a la publicacion
        private int dislike; // no me gusta la publicacion
        private Comment comment;

        @Embeddable
        public static class Comment {

            @Id
            @GeneratedValue(strategy = GenerationType.IDENTITY)
            private Long comment_id;
            private int author_comment_id;
            private String body_comment;
            private String[] multimedia_comment;

            public Comment() {
            }

            public Comment(Long comment_id, int author_comment_id, String body_comment, String[] multimedia_comment) {
                this.comment_id = comment_id;
                this.author_comment_id = author_comment_id;
                this.body_comment = body_comment;
                this.multimedia_comment = multimedia_comment;
            }

            public Long getComment_id() {
                return comment_id;
            }

            public void setComment_id(Long comment_id) {
                this.comment_id = comment_id;
            }

            public int getAuthor_comment_id() {
                return author_comment_id;
            }

            public void setAuthor_comment_id(int author_comment_id) {
                this.author_comment_id = author_comment_id;
            }

            public String getBody_comment() {
                return body_comment;
            }

            public void setBody_comment(String body_comment) {
                this.body_comment = body_comment;
            }

            public String[] getMultimedia_comment() {
                return multimedia_comment;
            }

            public void setMultimedia_comment(String[] multimedia_comment) {
                this.multimedia_comment = multimedia_comment;
            }

            @Override
            public String toString() {
                return "Comment{" +
                        "comment_id=" + comment_id +
                        ", author_comment_id=" + author_comment_id +
                        ", body_comment='" + body_comment + '\'' +
                        ", multimedia_comment=" + multimedia_comment +
                        '}';
            }
        }
        // comment debe ser un objeto (comment id, autor coment id, body comment, multimedia commnet) @embedable

        // constructores
        public Publication() {
        }

    public Publication(Long id, int author, String title, String body, String[] multimedia, String[] tags, int like, int dislike, Comment comment) {
        Id = id;
        this.author = author;
        this.title = title;
        this.body = body;
        this.multimedia = multimedia;
        this.tags = tags;
        this.like = like;
        this.dislike = dislike;
        this.comment = comment;
    }

    // getter and setter

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public int getAuthor() {
        return author;
    }

    public void setAuthor(int author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String[] getMultimedia() {
        return multimedia;
    }

    public void setMultimedia(String[] multimedia) {
        this.multimedia = multimedia;
    }

    public String[] getTags() {
        return tags;
    }

    public void setTags(String[] tags) {
        this.tags = tags;
    }

    public int getLike() {
        return like;
    }

    public void setLike(int like) {
        this.like = like;
    }

    public int getDislike() {
        return dislike;
    }

    public void setDislike(int dislike) {
        this.dislike = dislike;
    }

    public Comment getComment() {
        return comment;
    }

    public void setComment(Comment comment) {
        this.comment = comment;
    }

    // Creamos toString

    @Override
    public String toString() {
        return "Publication{" +
                "Id=" + Id +
                ", author=" + author +
                ", title='" + title + '\'' +
                ", body='" + body + '\'' +
                ", multimedia=" + multimedia +
                ", tags=" + tags +
                ", like=" + like +
                ", dislike=" + dislike +
                ", comment=" + comment +
                '}';
    }
}
