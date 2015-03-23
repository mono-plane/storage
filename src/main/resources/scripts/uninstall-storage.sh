#!/bin/sh

set -o xtrace

rm -f bin/nodetool
rm -rf modules/system/layers/base/org/wildfly/extension/monoplane/storage/
rm -f standalone/configuration/standalone-storage.xml
rm -f domain/configuration/storage-domain.xml
rm -f domain/configuration/storage-host.xml