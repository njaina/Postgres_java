package com.company.base.service.event;

import com.company.base.PojaGenerated;
import com.company.base.endpoint.event.gen.UuidCreated;
import com.company.base.repository.DummyUuidRepository;
import com.company.base.repository.model.DummyUuid;
import java.util.function.Consumer;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@PojaGenerated
@Service
@AllArgsConstructor
public class UuidCreatedService implements Consumer<UuidCreated> {

  private final DummyUuidRepository dummyUuidRepository;

  @Override
  public void accept(UuidCreated uuidCreated) {
    var dummyUuid = new DummyUuid();
    dummyUuid.setId(uuidCreated.getUuid());
    dummyUuidRepository.save(dummyUuid);
  }
}
