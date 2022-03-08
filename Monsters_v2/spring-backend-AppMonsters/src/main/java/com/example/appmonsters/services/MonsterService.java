package com.example.appmonsters.services;

import com.example.appmonsters.models.Monster;
import com.example.appmonsters.repositories.MonsterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

@Repository
public class MonsterService
{
    @Autowired
    MonsterRepository repository;

    public List<Monster> findAll() {
        return repository.findAll();
    }

    public List<Monster> findAll(Sort sort) {
        return repository.findAll(sort);
    }

    public List<Monster> findAllById(Iterable<Long> longs) {
        return repository.findAllById(longs);
    }

    public <S extends Monster> List<S> saveAll(Iterable<S> entities) {
        return repository.saveAll(entities);
    }

    public void flush() {
        repository.flush();
    }

    public <S extends Monster> S saveAndFlush(S entity) {
        return repository.saveAndFlush(entity);
    }

    public <S extends Monster> List<S> saveAllAndFlush(Iterable<S> entities) {
        return repository.saveAllAndFlush(entities);
    }

    @Deprecated
    public void deleteInBatch(Iterable<Monster> entities) {
        repository.deleteInBatch(entities);
    }

    public void deleteAllInBatch(Iterable<Monster> entities) {
        repository.deleteAllInBatch(entities);
    }

    public void deleteAllByIdInBatch(Iterable<Long> longs) {
        repository.deleteAllByIdInBatch(longs);
    }

    public void deleteAllInBatch() {
        repository.deleteAllInBatch();
    }

    @Deprecated
    public Monster getOne(Long aLong) {
        return repository.getOne(aLong);
    }

    public Monster getById(Long aLong) {
        return repository.getById(aLong);
    }

    public <S extends Monster> List<S> findAll(Example<S> example) {
        return repository.findAll(example);
    }

    public <S extends Monster> List<S> findAll(Example<S> example, Sort sort) {
        return repository.findAll(example, sort);
    }

    public Page<Monster> findAll(Pageable pageable) {
        return repository.findAll(pageable);
    }

    public <S extends Monster> S save(S entity) {
        return repository.save(entity);
    }

    public Optional<Monster> findById(Long aLong) {
        return repository.findById(aLong);
    }

    public boolean existsById(Long aLong) {
        return repository.existsById(aLong);
    }

    public long count() {
        return repository.count();
    }

    public void deleteById(Long aLong) {
        repository.deleteById(aLong);
    }

    public void delete(Monster entity) {
        repository.delete(entity);
    }

    public void deleteAllById(Iterable<? extends Long> longs) {
        repository.deleteAllById(longs);
    }

    public void deleteAll(Iterable<? extends Monster> entities) {
        repository.deleteAll(entities);
    }

    public void deleteAll() {
        repository.deleteAll();
    }

    public <S extends Monster> Optional<S> findOne(Example<S> example) {
        return repository.findOne(example);
    }

    public <S extends Monster> Page<S> findAll(Example<S> example, Pageable pageable) {
        return repository.findAll(example, pageable);
    }

    public <S extends Monster> long count(Example<S> example) {
        return repository.count(example);
    }

    public <S extends Monster> boolean exists(Example<S> example) {
        return repository.exists(example);
    }

    public <S extends Monster, R> R findBy(Example<S> example, Function<FluentQuery.FetchableFluentQuery<S>, R> queryFunction) {
        return repository.findBy(example, queryFunction);
    }
}

