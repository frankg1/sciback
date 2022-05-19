package com.fdu.sciback.entity;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Objects;

@Entity
@Table(name = "dblp", schema = "public", catalog = "postgres")
public class DblpEntity {
    @Basic
    @Column(name = "id")
    private String id;
    @Basic
    @Column(name = "title")
    private String title;
    @Basic
    @Column(name = "authors")
    private Object authors;
    @Basic
    @Column(name = "venue")
    private Object venue;
    @Basic
    @Column(name = "year")
    private Object year;
    @Basic
    @Column(name = "keywords")
    private Object keywords;
    @Basic
    @Column(name = "fos")
    private String fos;
    @Basic
    @Column(name = "references1")
    private Object references1;
    @Basic
    @Column(name = "n_citation")
    private String nCitation;
    @Basic
    @Column(name = "page_start")
    private String pageStart;
    @Basic
    @Column(name = "page_end")
    private String pageEnd;
    @Basic
    @Column(name = "doc_type")
    private String docType;
    @Basic
    @Column(name = "lang")
    private String lang;
    @Basic
    @Column(name = "publisher")
    private String publisher;
    @Basic
    @Column(name = "volume")
    private String volume;
    @Basic
    @Column(name = "issue")
    private String issue;
    @Basic
    @Column(name = "issn")
    private String issn;
    @Basic
    @Column(name = "isbn")
    private String isbn;
    @Basic
    @Column(name = "doi")
    private String doi;
    @Basic
    @Column(name = "pdf")
    private String pdf;
    @Basic
    @Column(name = "url")
    private Object url;
    @Basic
    @Column(name = "abstract1")
    private String abstract1;
    @Basic
    @Column(name = "indexed_abstract")
    private Object indexedAbstract;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Object getAuthors() {
        return authors;
    }

    public void setAuthors(Object authors) {
        this.authors = authors;
    }

    public Object getVenue() {
        return venue;
    }

    public void setVenue(Object venue) {
        this.venue = venue;
    }

    public Object getYear() {
        return year;
    }

    public void setYear(Object year) {
        this.year = year;
    }

    public Object getKeywords() {
        return keywords;
    }

    public void setKeywords(Object keywords) {
        this.keywords = keywords;
    }

    public String getFos() {
        return fos;
    }

    public void setFos(String fos) {
        this.fos = fos;
    }

    public Object getReferences1() {
        return references1;
    }

    public void setReferences1(Object references1) {
        this.references1 = references1;
    }

    public String getnCitation() {
        return nCitation;
    }

    public void setnCitation(String nCitation) {
        this.nCitation = nCitation;
    }

    public String getPageStart() {
        return pageStart;
    }

    public void setPageStart(String pageStart) {
        this.pageStart = pageStart;
    }

    public String getPageEnd() {
        return pageEnd;
    }

    public void setPageEnd(String pageEnd) {
        this.pageEnd = pageEnd;
    }

    public String getDocType() {
        return docType;
    }

    public void setDocType(String docType) {
        this.docType = docType;
    }

    public String getLang() {
        return lang;
    }

    public void setLang(String lang) {
        this.lang = lang;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getVolume() {
        return volume;
    }

    public void setVolume(String volume) {
        this.volume = volume;
    }

    public String getIssue() {
        return issue;
    }

    public void setIssue(String issue) {
        this.issue = issue;
    }

    public String getIssn() {
        return issn;
    }

    public void setIssn(String issn) {
        this.issn = issn;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getDoi() {
        return doi;
    }

    public void setDoi(String doi) {
        this.doi = doi;
    }

    public String getPdf() {
        return pdf;
    }

    public void setPdf(String pdf) {
        this.pdf = pdf;
    }

    public Object getUrl() {
        return url;
    }

    public void setUrl(Object url) {
        this.url = url;
    }

    public String getAbstract1() {
        return abstract1;
    }

    public void setAbstract1(String abstract1) {
        this.abstract1 = abstract1;
    }

    public Object getIndexedAbstract() {
        return indexedAbstract;
    }

    public void setIndexedAbstract(Object indexedAbstract) {
        this.indexedAbstract = indexedAbstract;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DblpEntity that = (DblpEntity) o;
        return Objects.equals(id, that.id) && Objects.equals(title, that.title) && Objects.equals(authors, that.authors) && Objects.equals(venue, that.venue) && Objects.equals(year, that.year) && Objects.equals(keywords, that.keywords) && Objects.equals(fos, that.fos) && Objects.equals(references1, that.references1) && Objects.equals(nCitation, that.nCitation) && Objects.equals(pageStart, that.pageStart) && Objects.equals(pageEnd, that.pageEnd) && Objects.equals(docType, that.docType) && Objects.equals(lang, that.lang) && Objects.equals(publisher, that.publisher) && Objects.equals(volume, that.volume) && Objects.equals(issue, that.issue) && Objects.equals(issn, that.issn) && Objects.equals(isbn, that.isbn) && Objects.equals(doi, that.doi) && Objects.equals(pdf, that.pdf) && Objects.equals(url, that.url) && Objects.equals(abstract1, that.abstract1) && Objects.equals(indexedAbstract, that.indexedAbstract);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, title, authors, venue, year, keywords, fos, references1, nCitation, pageStart, pageEnd, docType, lang, publisher, volume, issue, issn, isbn, doi, pdf, url, abstract1, indexedAbstract);
    }
}
