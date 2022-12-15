import { TestBed } from '@angular/core/testing';

import { SortingServerService } from './sorting-server.service';

describe('SortingServerService', () => {
  let service: SortingServerService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(SortingServerService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
